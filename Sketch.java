import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(370, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(77, 118, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// drawings

    //Drawing ground (rectangle)

    fill(18, 74, 19);
    stroke(200);
    rect(0, 250, 400, 400);

    //Drawing house base (rectangle)
    
    fill(110, 31, 31);
    rect(100, 200, 100, 100);

    //Drawing door (rectangles)
    
    fill(166, 86, 2);
    rect(120, 260, 25, 40 );

    //Drawing path (rectangle)
    fill(102, 105, 110);
    rect(120, 300, 25, 100);

    //Drawing windows (rectangles)

    fill(245, 230, 215);
    rect(120, 220, 60, 30);
    
    fill(245, 230, 216);
    rect(160, 265, 20, 20);

    //Drawing roof (triangle)

    fill(135, 34, 27);
    triangle(100, 200, 200, 200, 150, 160);

    //Drawing sun (circle)

    fill(252, 227, 3);
    ellipse(300, 70, 80, 80);

    //Drawing clouds (ellipse)

    fill(255, 255, 255);
    ellipse(50, 70, 45, 30);

    fill(255, 255, 255);
    ellipse(90, 73, 45, 30);

    fill(255, 255, 255);
    ellipse(70, 80, 45, 30);
    
    fill(255, 255, 255);
    ellipse(80, 60, 45, 30);

    //drawing tree (circle, Rectangle)

    fill(97, 64, 12);
    rect(300, 320, 15, 40);

    fill(255, 183, 0);
    ellipse(307, 300, 50, 50);
    
  } 
}