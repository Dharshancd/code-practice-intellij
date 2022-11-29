package com.dharshan.exception;

public class MethodOverriding  {

    public static void main(String[] args ) {
        Animal a = new Tiger();
        try  {
            a.speak(5);
        } catch (CantSpeakException | NullPointerException e) {
            throw new RuntimeException(e);
        }
    }




}


class Animal {
    protected Object speak(Number times) throws CantSpeakException {
        for (int i = 0; i < times.intValue(); i++) {
            System.out.println("Speaking... " + i);

        }
        return new Object();
    }
}

class Tiger extends Animal {

    @Override
    public String speak(Number times) throws CantSpeakSubException{
        for (int i = 0; i < times.intValue(); i++) {
            System.out.println("Tiger is Speaking... " + i);

        }
        return "Tiger";
    }
}

class CantSpeakException extends Exception {
    public CantSpeakException(String message) {
        super(message);
    }
}

class CantSpeakSubException extends CantSpeakException {

    public CantSpeakSubException(String message) {
        super(message);
    }
}