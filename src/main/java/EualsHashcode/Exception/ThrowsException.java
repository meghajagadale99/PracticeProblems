package EualsHashcode.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public
class ThrowsException {

    public void m1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/Users/meghaprakashjagadale/jagadale.txt");
    }
}
class Megha{
    public static
    void main(String[] args) throws FileNotFoundException {
        ThrowsException throwsException = new ThrowsException();
        throwsException.m1();
    }
}