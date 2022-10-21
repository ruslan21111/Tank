class Main {

    public static void main(String[] args) {


        Tank tank = new Tank();
        tank.goForward(30);
        tank.printPosition();
        //  tank.turnRight();
        tank.goForward(40);
        tank.printPosition();
        //  tank.turnLeft();
        tank.goBackward(1500);
        tank.printPosition();

    }
}