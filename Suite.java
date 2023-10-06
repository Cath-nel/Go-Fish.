public class Suite{
  public static final int SUITE_HEARTS = 1;
  public static final int SUITE_DIAMONDS = 2;
  public static final int SUITE_CLUBS = 3;
  public static final int SUITE_SPADES = 4;

  public static String getSuite(int num){
      switch(num){
        case Suite.SUITE_HEARTS:
              return "Hearts";
          break;
          case Suite.SUITE_DIAMONDS:
              return "Diamonds";
          break;
          case Suite.SUITE_CLUBS:
              return "Clubs";
          break;
          case Suite.SUITE_SPADES:
              return "Spades";
          break;
        default:
          return "Invalid input";
      }
  }
}
