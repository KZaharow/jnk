package tst.zaharov;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream.generate(Gretting::new).limit(100).forEach(Gretting::getGreeting);
        Stream.generate(Gretting::new).limit(100).forEach(Gretting::getGreeting);
    }
}
