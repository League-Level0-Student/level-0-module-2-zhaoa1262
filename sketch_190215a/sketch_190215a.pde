void setup() {

  background(164,221,242);
    size(800, 200);
}

void draw() {
  int c = 0;
  fill(245,135,230);
  noStroke();
  ellipse(c,100,20,20);
  
  if(mousePressed) {
    int i = 0;
    
    ellipse(c+800, 100, 20, 20);
    
  }
}