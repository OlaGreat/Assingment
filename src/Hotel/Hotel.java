package Hotel;

import java.util.Arrays;
import java.util.Scanner;
    public class Hotel {
        private String [] rooms;

        Scanner input = new Scanner(System.in);

        public Hotel(int roomLength){
            this.rooms = new String[roomLength];

        }
        public String  displayMenu(){
            return """ 
                 Welcome !!!
                 Enter 1 -> To book room
                 2  -> Checkout
                 3-> Get available rooms
                 4 -> Get booked rooms
                 5-> Get room Guest
                 6 -> Get all guest
                 """;
        }
        public String bookRoom(String user) {
            System.out.println("""
                      Enter customer's names to book
                      """);
            for (int i = 0; i < rooms.length ; i++) {
                if(rooms[i] == null) {
                    rooms[i] = user;
                    break;
                }
            }
            return "Room booked successfully";
        }

        public boolean checkOut(int roomNumbers) {
            System.out.println("""
                    Enter room number to check out""");
            boolean hasCheckedOut = false;
            if(rooms[roomNumbers-1] != null ){
                rooms[roomNumbers-1] = null;
                hasCheckedOut = true;
            }
            return hasCheckedOut;
        }
        public int getRooms() {
            System.out.println("""
                    Total numbers of rooms:""");
            return rooms.length;
        }

        public int getAvailableRoom() {
            System.out.println("""
                    Total numbers of available room is: """);
            int emptyRooms = 0;
            for (int i = 0; i < rooms.length ; i++) {
                if (rooms[i] == null){
                    emptyRooms++;
                }
            }
            return emptyRooms;
        }

        public int getBookedRooms() {
            System.out.println("""
                    Total numbers of booked rooms is: """);
            int bookedRooms = 0;
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i] != null) {
                    bookedRooms++;
                }
            }
            return bookedRooms;
        }

        public String getRoomGuest(int guest) {
            System.out.println("""
                    The rooms are occupied by: """);
            return rooms[guest];
        }

        public String getAllGuest() {
            System.out.println("""
                    Here are the name of those who are currently lodge 
                    in your hotel:""");
            String [] guest = new String[getBookedRooms()];
            for (int i = 0; i < rooms.length; i++) {
                if(rooms[i]!= null){
                    guest[i]= rooms[i];
                }
            }
            return Arrays.toString(guest);
        }
        public void userChoice(){
            int userInput = input.nextInt();
            switch (userInput){
            case 1:
                bookRoom("user");
                break;
                case 2:
                    checkOut(1);
                    break;
                case 3:
                    getRooms();
                    break;
                case 4:
                    getAvailableRoom();
                    break;
                case 5:
                    getRoomGuest(2);
                    break;
                case 6:
                    getAllGuest();
                    break;
                default:
                    System.out.println("invalid input");
                    break;


        }
        }
    }

