package com.ptp.phamtanphat.listviewnangcao0208;

/**
 * Created by KhoaPhamPC on 28/8/2017.
 */

public class Animal {
    private String Ten;
    private int HinhAnh;

    public Animal(String ten, int hinhAnh) {
        Ten = ten;
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }
}
