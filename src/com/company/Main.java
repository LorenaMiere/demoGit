package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("first commit");
        System.out.println("first commit Lore - test branch");
        System.out.println("second commit Lore - test branch");
    }
    public static void cata(){
        System.out.println("first commit cata"); //master branch
    }
    public static void cata2(){
        System.out.println("second commit cata"); //still on master branch
    }

    public static void catalin3(){
        System.out.println("third commit cata"); //still on master branch
    }
    public static void lore(){
        System.out.println("commit on test branch");
        System.out.println("commit on master branch -> lore");
    }

    public static void testBranchNewFeature() {
        System.out.println("new inovation");
        System.out.println("aaa");
        System.out.println("bbb");
    }
    public static void testBranchSecondFeature() {
        System.out.println("new 2inovation");
    }
    public static void testBranchThirdFeature() {
        System.out.println("new 3inovation");
    }
}
