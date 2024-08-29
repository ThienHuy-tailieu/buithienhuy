/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    public int soao;
    public String hoten;
    public int namsinh;
    public int luongcung;
    public int tienthuong;
    public int tienphat;
    
    public CauThu(int soao,String hoten,int namsinh,int luongcung,int tienthuong,int tienphat){
        this.soao=soao;
        this.hoten=hoten;
        this.namsinh=namsinh;
        this.luongcung=luongcung;
        this.tienthuong=tienthuong;
        this.tienphat=tienphat;
    }

    public int getSoao() {
        return soao;
    }    
    public double getLuongCung(){
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }    
    public double getTienThuong(){
        return tienthuong;
    }

    public void setTienthuong(int tienthuong) {
        this.tienthuong = tienthuong;
    }

    public void setTienphat(int tienphat) {
        this.tienphat = tienphat;
    }
    
    public double getTienPhat(){
        return tienphat;
    }
    public double tinhLuongThuc(){
        return luongcung+tienthuong-tienphat;
    }
}
