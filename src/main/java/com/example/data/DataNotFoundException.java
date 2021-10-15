package com.example.data;

class DataNotFoundException extends RuntimeException {

    DataNotFoundException(Long id) {
        super("Data Buku tidak tersedia " + id);
    }

}
