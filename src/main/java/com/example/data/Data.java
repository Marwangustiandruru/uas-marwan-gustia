package com.example.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private @Id @GeneratedValue Long id;
    private Long isbn;
    private String judul;
    private String penerbit;
    private String tahun;
    private String penulis;
    private Long price;

    Data() {
    }

    Data(Long isbn, String judul, String penerbit, String tahun, String penulis, Long price) {
        this.isbn = isbn;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.penulis = penulis;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public Long getIsbn() {
        return this.isbn;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    public String getTahun() {
        return this.tahun;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Data))
            return false;
        Data data = (Data) o;
        return Objects.equals(this.id, data.id) && Objects.equals(this.isbn, data.isbn)
                && Objects.equals(this.judul, data.judul) && Objects.equals(this.penerbit, data.penerbit)
                && Objects.equals(this.tahun, data.tahun) && Objects.equals(this.penulis, data.penulis)
                && Objects.equals(this.price, data.price);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.isbn, this.judul, this.penerbit, this.tahun, this.penulis, this.price);
    }

    @Override
    public String toString() {
        return "Data buku{" + "id=" + this.id + ", Isbn='" + this.isbn + '\'' + ", Judul='" + this.judul + '\''
                + ", alamat='" + this.penerbit + '\'' + ", Tahun='" + this.tahun + '\'' + ", Penulis='"
                + this.penulis + '\'' + ", harga='" + this.price + '\'' +  '}';
    }

}
