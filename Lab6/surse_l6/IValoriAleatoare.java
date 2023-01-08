//: IValoriAleatoare.java
// Initializarea este facuta la prima incarcare (utilizare) a interfetei
import java.util.*;

public interface IValoriAleatoare {
  Random alt = new Random();
  int aleatorInt = alt.nextInt(10);
  long aleatorLong = alt.nextLong() * 10;
  float aleatorFloat = alt.nextLong() * 10;
  double aleatorDouble = alt.nextDouble() * 10;
} ///:~
