import java.util.Scanner;

public class ElevatorSystem {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String welcomeMessage = "\nWelcome to Elevator System!\n\n";
        String reminder = "You are currently on floor: ";
        String chooseFloor = "Please choose your destination floor: ";
        String youArrived = "You have arrived at floor: ";
        String youAlready = "You are already on the desired floor.";
        String tryAgain = "\nDo you want to try again? (yes/no): ";
        String goodbye = "\nThank you for using the Elevator System!\n";
        int currentFloor = 1;

        boolean isRunning = true;
        

        Thread.sleep(2000);
        
        for (char a: welcomeMessage.toCharArray()) {
            System.out.print(a);
            Thread.sleep(10);
        }

while (isRunning) {

        Thread.sleep(2000);
        for (char b: reminder.toCharArray()) {
            System.out.print(b);
            Thread.sleep(10);   
        }

        System.out.println(" " + currentFloor + " \n");
        
        Thread.sleep(2000);
        for (char c: chooseFloor.toCharArray()) {
            System.out.print(c);
            Thread.sleep(10);   
        }
        Thread.sleep(1000);
        int destinationFloor = scanner.nextInt();

        if (destinationFloor > currentFloor) {
            for (int i = currentFloor + 1; i < destinationFloor; i++) {
                Thread.sleep(2000);
                System.out.println("Going Up... Floor " + i);
                
            }
            Thread.sleep(2500);
            for (char d: youArrived.toCharArray()) {
                System.out.print(d);
                Thread.sleep(10);   
            }
            Thread.sleep(1000);
            System.out.println(destinationFloor + ".");
        } else if (destinationFloor < currentFloor) {
            for (int i = currentFloor - 1; i > destinationFloor; i--) {
                Thread.sleep(2000);
                System.out.println("Going Down... Floor " + i);
                
            }
            Thread.sleep(2000);
            for (char d: youArrived.toCharArray()) {
                System.out.print(d);
                Thread.sleep(10);   
            }
            Thread.sleep(1000);
            System.out.println(destinationFloor + "\n");
            
        } else {
            Thread.sleep(1000);
            for (char e: youAlready.toCharArray()) {
                System.out.print(e);
                Thread.sleep(10);   
            }
           
            
        }

        
         currentFloor = destinationFloor;

            Thread.sleep(2000);
            for (char f : tryAgain.toCharArray()) {
                System.out.print(f);
                Thread.sleep(10);
            }

            scanner.nextLine(); // clear buffer
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                Thread.sleep(1000);
                for (char g : goodbye.toCharArray()) {
                    System.out.print(g);
                    Thread.sleep(10);
                }
                isRunning = false;
            }
        }
         

        scanner.close();
       }
    }
