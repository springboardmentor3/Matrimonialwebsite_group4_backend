//package com.infosys.MatrimonialWebApplication.Controllers;
//
//import com.infosys.MatrimonialWebApplication.entitites.ImageModel;
//import com.infosys.MatrimonialWebApplication.repo.ImageRepository;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.zip.DataFormatException;
//import java.util.zip.Deflater;
//import java.util.zip.Inflater;
//
//@Log4j2
//@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping(path = "image")
//public class ImageUploadController {
//
//    @Autowired
//    private ImageRepository imageRepository;
//
//    @PostMapping("/upload")
//    public ResponseEntity.BodyBuilder uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
//
//        log.info("Original Image Byte Size - " + file.getBytes().length);
//        ImageModel img = new ImageModel(file.getOriginalFilename(), file.getContentType(),
//                compressBytes(file.getBytes()));
//        imageRepository.save(img);
//        return ResponseEntity.status(HttpStatus.OK);
//    }
//
////    @GetMapping(path = {"/get/{imageName}"})
////    public ImageModel getImage(@PathVariable("imageName") String imageName) throws IOException {
////
////        final Optional<ImageModel> retrievedImage = imageRepository.findByName(imageName);
////        ImageModel img = new ImageModel(retrievedImage.get().getName(), retrievedImage.get().getType(),
////                decompressBytes(retrievedImage.get().getPicByte()));
////        return img;
////    }
//
//    @GetMapping(path = {"/get/{imageId}"})
//    public ImageModel getImage(@PathVariable("imageId") Long id) throws IOException {
//
//        final Optional<ImageModel> retrievedImage = imageRepository.findById(id);
//        ImageModel img = new ImageModel(retrievedImage.get().getName(), retrievedImage.get().getType(),
//                decompressBytes(retrievedImage.get().getPicByte()));
//        return img;
//    }
//
//    @GetMapping(path = "/images")
//    public List<ImageModel> getAllImages() {
//        List<ImageModel> allImages = imageRepository.findAll();
//        return allImages.stream()
//                .map(img -> new ImageModel(img.getName(), img.getType(), decompressBytes(img.getPicByte())))
//                .collect(Collectors.toList());
//    }
//
//
//
//
//    // compress the image bytes before storing it in the database
//    public static byte[] compressBytes(byte[] data) {
//        Deflater deflater = new Deflater();
//        deflater.setInput(data);
//        deflater.finish();
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//        byte[] buffer = new byte[1024];
//        while (!deflater.finished()) {
//            int count = deflater.deflate(buffer);
//            outputStream.write(buffer, 0, count);
//        }
//        try {
//            outputStream.close();
//        } catch (IOException e) {
//        }
//        System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
//
//        return outputStream.toByteArray();
//    }
//
//    // uncompress the image bytes before returning it to the angular application
//    public static byte[] decompressBytes(byte[] data) {
//        Inflater inflater = new Inflater();
//        inflater.setInput(data);
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//        byte[] buffer = new byte[1024];
//        try {
//            while (!inflater.finished()) {
//                int count = inflater.inflate(buffer);
//                outputStream.write(buffer, 0, count);
//            }
//            outputStream.close();
//        } catch (IOException ioe) {
//        } catch (DataFormatException e) {
//        }
//        return outputStream.toByteArray();
//    }
//}

package com.infosys.MatrimonialWebApplication.Controllers;

import com.infosys.MatrimonialWebApplication.entitites.ImageModel;
import com.infosys.MatrimonialWebApplication.repo.ImageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

@Log4j2
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "image")
public class ImageUploadController {

    @Autowired
    private ImageRepository imageRepository;

    @PostMapping("/upload")
    public ResponseEntity.BodyBuilder uploadImage(@RequestParam("imageFile") MultipartFile file,
                                                  @RequestParam("id") Long id) throws IOException {
        log.info("Original Image Byte Size - " + file.getBytes().length);
        ImageModel img = new ImageModel(id,file.getOriginalFilename(), file.getContentType(),
                compressBytes(file.getBytes()));
        imageRepository.save(img);
        return ResponseEntity.status(HttpStatus.OK);
    }

    @GetMapping(path = {"/get/{imageId}"})
    public ImageModel getImage(@PathVariable("imageId") Long id) throws IOException {
        final Optional<ImageModel> retrievedImage = imageRepository.findById(id);
        ImageModel img = new ImageModel(id,retrievedImage.get().getName(), retrievedImage.get().getType(),
                decompressBytes(retrievedImage.get().getPicByte()));
        return img;
    }

    @GetMapping(path = "/images")
    public List<ImageModel> getAllImages() {
        List<ImageModel> allImages = imageRepository.findAll();
        return allImages.stream()
                .map(img -> new ImageModel( img.getId(),img.getName(), img.getType(), decompressBytes(img.getPicByte())))
                .collect(Collectors.toList());
    }

    // compress the image bytes before storing it in the database
    public static byte[] compressBytes(byte[] data) {
        Deflater deflater = new Deflater();
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            outputStream.write(buffer, 0, count);
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            // handle exception
        }
        System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

        return outputStream.toByteArray();
    }

    // uncompress the image bytes before returning it to the angular application
    public static byte[] decompressBytes(byte[] data) {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();
        } catch (IOException | DataFormatException e) {
            // handle exceptions
        }
        return outputStream.toByteArray();
    }
}
