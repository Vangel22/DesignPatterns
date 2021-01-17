package Adapter;

class TestEnemyAttackers{

    public static void main(String[] args){

        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        //the interface object defines the usage of the object and the methods
        // with the assignment of EnemyRobotAdapter here

        EnemyAttacker enemyTank = new EnemyTank();

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The First Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
        System.out.println();

        System.out.println("The Second Enemy Tank");

        enemyTank.assignDriver("Jack");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

    }

}
//Allows 2 incompatible interfaces to work together
//Used when the client expects a target INTERFACE

/*The logic is that EnemyRobot doesn't use the EnemyAttacker interface because of different implementation
* but that is why we use the EnemyRobotAdapter so we can execute EnemeyRobot methods with the help of the
* methods in EnemyAttacker
* */