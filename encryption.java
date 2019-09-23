import java.io.*;
public class encryption {//to encryption of given file

  static  int a = ((int) (Math.random() * 26));
    static  int b= ((int) (Math.random() * 26));
        static int  randommethod() {//method for choose random number
           while (a % 2 == 0 || a % 13 == 0 || a % 26 == 0) {
               if (a % 2 !=0 && a % 13 != 0 && a % 26 != 0) {
                   return a;
               } else {
                   a = ((int) (Math.random() * 26));
               } }
           return 0;
       }
    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        randommethod();
        FileReader fr =//define the file
                new FileReader("HW4_history of istanbul.txt");
        String path = "test_1.txt";
        File dosya = new File(path);
        PrintWriter dosyayaz=new PrintWriter(dosya);

        char[]arr1 ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};//store letter
       char[]arr2 ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};//store letter
        int p;//different integer for every letter
        int k;//remainder
        int i;//index of char arrays
        while ((i=fr.read()) != -1) {

            if(((char) i) == 'A') { p = 0;
               k = (a * p + b) % 26;
               for(int n=0; n<=25; n++){
                   if(k==n){
                       System.out.print(arr1[n]);//n equal to remainder then nth index of array give us encrytied letter
                       dosyayaz.print(arr1[n]);//encrytied letter is written to screen
                       break;} }}
            else if(((char) i) == 'a'){ p = 0;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                    break; }} }

           else if(((char) i) == 'B') { p = 1;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'b'){ p = 1;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'C') { p = 2;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'c'){ p = 2;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
          else if(((char) i) == 'D') { p = 3;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'd'){ p = 3;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'E') { p = 4;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'e'){ p = 4;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'F') { p = 5;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'f'){ p = 5;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'G') { p = 6;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'g'){ p = 6;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'H') { p = 7;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'h'){ p = 7;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'I') { p = 8;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'i'){ p = 8;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'J') { p = 9;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'j'){ p = 9;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'K') { p = 10;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'k'){ p = 10;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'L') { p = 11;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'l'){ p = 11;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'M') { p = 12;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'm'){ p = 12;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
          else if(((char) i) == 'N') { p = 13;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'n'){ p = 13;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'O') { p = 14;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'o'){ p = 14;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
           else if(((char) i) == 'P') { p = 15;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'p'){ p = 15;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'Q') { p = 16;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'q'){ p = 16;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'R') { p = 17;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'r'){ p = 17;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'S') { p = 18;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 's'){ p = 18;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'T') { p = 19;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 't'){ p = 19;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'U') { p = 20;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'u'){ p = 20;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'V') { p = 21;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'v'){ p = 21;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'W') { p = 22;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'w'){ p = 22;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'X') { p = 23;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'x'){ p = 23;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'Y') { p = 24;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'y'){ p = 24;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else if(((char) i) == 'Z') { p = 25;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr1[n]);
                        dosyayaz.print(arr1[n]);
                        break;} }}
            else if(((char) i) == 'z'){ p = 25;
                k = (a * p + b) % 26;
                for(int n=0; n<=25; n++){
                    if(k==n){
                        System.out.print(arr2[n]);
                        dosyayaz.print(arr2[n]);
                        break; }} }
            else{
                System.out.print((char) i);
                dosyayaz.print((char) i);
            } }
        dosyayaz.close();//end of the file
        System.out.println(a);//value of a
        System.out.println(b);//value of b
    }
}