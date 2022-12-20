package org.mai.project.obstanovka;

import java.util.Scanner;

public class ObstanovkaSetterNGetter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Data meaning1 = new Data();
        float s1 = scanner.nextFloat();
        meaning1.setElpl(s1);
        meaning1.getElpl();

        Data meaning2 = new Data();
        float s2 = scanner.nextFloat();
        meaning2.setMagcom(s2);
        meaning2.getMagcom();

        Data meaning3 = new Data();
        float s3 = scanner.nextFloat();
        meaning3.setFlpl(s3);
        meaning3.getFlpl();

        Data meaning4 = new Data();
        float s4 = scanner.nextFloat();
        meaning4.setVnpmagpol(s4);
        meaning4.getVnpmagpol();

        Data meaning5 = new Data();
        float s5 = scanner.nextFloat();
        meaning5.setGradpolb(s5);
        meaning5.getGradpolb();

        Data meaning6 = new Data();
        float s6 = scanner.nextFloat();
        meaning6.setVnkv(s6);
        meaning6.getVnkv();

        Data meaning7 = new Data();
        float s7 = scanner.nextFloat();
        meaning7.setGradpole(s7);
        meaning7.getGradpole();
    }
}

class Data {
    private float elpl;
    private float magcom;
    private float flpl;
    private float vnpmagpol;
    private float gradpolb;
    private float vnkv;
    private float gradpole;

    public void setElpl(float konst){
        if ((0 > konst) && (konst > 10000000)){
            System.out.println("impossible");
        } else {
            elpl = konst;
        }
    }

    public float getElpl(){
        return elpl;
    }

    public void setMagcom(float konst){
        if ((0 > konst) && (konst > 40000)){
            System.out.println("impossible");
        } else {
            magcom = konst;
        }
    }

    public float getMagcom(){
        return magcom;
    }


    public void setFlpl(float konst){
        if ((1 > konst) && (konst > 40000)){
            System.out.println("impossible");
        } else {
            flpl = konst;
        }
    }

    public float getFlpl(){
        return flpl;
    }


    public void setVnpmagpol(float konst){
        if ((-50000 > konst) && (konst > 50000)){
            System.out.println("impossible");
        } else {
            vnpmagpol = konst;
        }
    }

    public float getVnpmagpol(){
        return vnpmagpol;
    }

    public void setGradpolb(float konst){
        if ((100 > konst) && (konst > 1000)){
            System.out.println("impossible");
        } else {
            gradpolb = konst;
        }
    }

    public float getGradpolb(){
        return gradpolb;
    }

    public void setVnkv(float konst){
        if ((-10 > konst) && (konst > 10)){
            System.out.println("impossible");
        } else {
            vnkv = konst;
        }
    }

    public float getVnkv(){
        return vnkv;
    }

    public void setGradpole(float konst){
        if ((10 > konst) && (konst > 1000)){
            System.out.println("impossible");
        } else {
            gradpole = konst;
        }
    }

    public float getGradpole(){
        return gradpole;
    }
}
