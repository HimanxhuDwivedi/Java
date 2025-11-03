public class SwitchExample {
        public static void main(String[] args) {
            int day = 5;
    
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break; // Prevents fall-through to case 4
                case 4:
                    System.out.println("Thursday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
            // Output: Wednesday
        }
    
}
