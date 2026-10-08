package com.firebase.config;

import java.util.HashMap;
import java.util.Map;

import com.cloudinary.Cloudinary;

public class CloudinaryConfig {

    public static Cloudinary cloudinary;

    public static Cloudinary getCloudinary() {

        if (cloudinary == null) {

            Map<String, Object> config = new HashMap<>();

            config.put("cloud_name", "yeutxdj1");
            config.put("api_key", "573131469367775");
            config.put("api_secret", "8EHZkVJWVFp6SJu1NfUYn1pR9GE");
            config.put("secure", true);

            cloudinary = new Cloudinary(config);
        }

        return cloudinary;
    }
}