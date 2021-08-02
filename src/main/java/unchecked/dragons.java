package unchecked;

import java.util.ArrayList;

class Dragons{
    public static void main(String[] args) {
        ArrayList<String> Dragons = new ArrayList<>(15);    //Only 15 spaces for elements
        Dragons.add("Red Big Scary.");
        System.out.println(Dragons.size());
        Dragons.set(0, "RED BIG SCARY.");
        System.out.println(Dragons.get(0));

    }
}