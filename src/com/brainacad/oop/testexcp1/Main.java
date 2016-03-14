package com.brainacad.oop.testexcp1;


public class Main {
    public static void main(String[] args) {
        //2.10.1
        try{ throw new Exception("Exeption");}
        catch (Exception a){
    System.out.println(a.getMessage());}
        finally {  System.out.println("Finally block"); }
    }}

