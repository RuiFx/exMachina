package Field;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MapFactory {

    public static Rectangle wall1, wall2, wall3, wall4, wall5, wall6, wall7, wall8, wall9,
            wall10, wall11, wall12, wall13, wall14, wall15,doorOne,doorThree,hologram;

    public static Rectangle checkpoint1,checkpoint2,checkpoint3,clock1,chair1,phone1,
            bed1,chair2,calendar, oldPhone, heating,computer, computerTwo,computerThree,computerFour,
            labLocker,labLocker2, coins, wristWatch1, wardrobe1,labLocker3,licence1,lamp1,router,exit;

    public static Rectangle doorTwo;

    //OBJECTS
    public static Picture book1,book2,book3,iPod1,table2,table3;

    public MapFactory() {
        wall1 = new Rectangle(1020, 80, 1, 560);
        //wall1.draw();
        //wall1.setColor(new Color(0, 159, 227));
        //wall1.fill();

        wall2 = new Rectangle(10, 80, 150, 40);
       // wall2.draw();
       // wall2.setColor(new Color(0, 159, 227));
        //wall2.fill();

        wall3 = new Rectangle(920, 60, 1, 40);
       // wall3.setColor(new Color(0, 159, 227));
        //wall3.draw();
        //wall3.fill();

        wall4 = new Rectangle(70, 60, 830, 50);
       // wall4.setColor(new Color(0, 159, 227));
       // wall4.draw();
        //wall4.fill();


        wall5 = new Rectangle(70, 60, 10, 530);
       // wall5.setColor(new Color(0, 159, 227));
       // wall5.draw();
        //wall5.fill();

        wall6 = new Rectangle(50, 580, 850, 10);
      //  wall6.setColor(new Color(0, 159, 227));
      //  wall6.draw();
      //  wall6.fill();

        wall7 = new Rectangle(930, 150, 5, 440);
      //  wall7.setColor(new Color(0, 159, 227));
        //wall7.draw();
        //wall7.fill();
         wall8 = new Rectangle(920, 150, 40, 10);
       //  wall8.setColor(new Color(0, 159, 227));
       //  wall8.draw();
       //  wall8.fill();

         wall9 = new Rectangle(950, 150, 10, 500);
        // wall9.setColor(new Color(0, 159, 227));
        // wall9.draw();
        // wall9.fill();

        wall10 = new Rectangle(70, 320, 50, 10);
       // wall10.setColor(new Color(0, 159, 227));
      //  wall10.draw();
      //  wall10.fill();

        wall11 = new Rectangle(70, 320, 40, 10);
      //  wall11.setColor(new Color(0, 159, 227));
      //  wall11.draw();
      //  wall11.fill();

        wall12 = new Rectangle(150, 320, 770, 10);
       // wall12.setColor(new Color(0, 159, 227));
       // wall12.draw();
      //  wall12.fill();

        wall13 = new Rectangle(500, 60, 10, 180);
       // wall13.setColor(new Color(0, 159, 227));
      //  wall13.draw();
       // wall13.fill();


        //wall14 = new Rectangle(500, 300, 10, 50);
       // wall14.setColor(new Color(0, 159, 227));
      //  wall14.draw();
       // wall14.fill();

        wall15 = new Rectangle(505, 390, 10, 200);
       // wall15.setColor(new Color(0, 159, 227));
      //  wall15.draw();
       // wall15.fill();

        this.computer = new Rectangle(700,67,30,15);
        this.computerTwo = new Rectangle(420,50,70,35);
        this.computerThree = new Rectangle(470, 500, 30,30);
        this.computerFour = new Rectangle(700,320,35,15);


       // this.doorOne = new Picture(480,260,"Resources/Objects/door.png");
        this.doorOne = new Rectangle(500,260,10,40);
        this.doorTwo = new Rectangle(70,330,60,10);
       // this.doorThree = new Rectangle(480,260,10,60);
        this.doorThree = new Rectangle(520,320,10,45);

        this.checkpoint1 = new Rectangle(1000,550,20,5);
        this.checkpoint1.draw();
        this.checkpoint2 = new Rectangle(950,70,5, 70);



        //OBJECTS

        this.book1 = new Picture(510,65,"Resources/Objects/bible1.png");



        this.iPod1 = new Picture(495,150,"Resources/Objects/iPod1.png");
        this.wardrobe1 = new Rectangle(770,255,150,55);



        this.hologram = new Rectangle(810,375,40,72);
        this.hologram.draw();



        this.clock1 = new Rectangle(150,50,32,32);
        this.chair2 = new Rectangle(200,282,40,36);
        this.chair1 = new Rectangle(300,40,40,36);
        this.bed1 = new Rectangle(70,60,50,80);
        this.calendar = new Rectangle(208,285,32,32);
        this.oldPhone = new Rectangle(165,540,25,32);
        this.heating = new Rectangle(70, 440, 30,100);
        this.labLocker = new Rectangle(190, 340, 80, 70 );
        this.labLocker2 = new Rectangle(325,340,80,70);
        this.coins = new Rectangle(204, 540, 32, 32 );
        this.phone1 = new Rectangle(480,410,30,24);
        this.wristWatch1 = new Rectangle(305,545,30,30);
        this.licence1 = new Rectangle(510,530,35,40);
        this.labLocker3 = new Rectangle(510,390,85,70);
        this.lamp1 = new Rectangle(910,320,5,60);
        this.router = new Rectangle(890,545,40,36);
        this.exit = new Rectangle(985,640,50,10);


    }

    public Rectangle getWall1() {
        return wall1;
    }

    public Rectangle getWall2() {
        return wall2;
    }

    public Rectangle getWall3() {
        return wall3;
    }

    public Rectangle getWall4() {
        return wall4;
    }

    public Rectangle getWall5() {
        return wall5;
    }

    public Rectangle getWall6() {
        return wall6;
    }

    public Rectangle getWall7() {
        return wall7;
    }

    public Rectangle getWall8() {
        return wall8;
    }

    public Rectangle getWall9() {
        return wall9;
    }

    public Rectangle getIntWall1() {
        return wall10;
}
    }
