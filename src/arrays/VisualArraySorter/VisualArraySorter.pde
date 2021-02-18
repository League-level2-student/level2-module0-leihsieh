float[] arr;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  size(500,500);
  //3. initialize your array with the built in width variable
  arr = new float[width];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for(int i = 0; i < width; i++){
    arr[i] = random(width);
  }
  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(0,0,0);
  //7. set the color for your graph
  fill(255,0,0);
  //8. draw a rectangle for each int in your array.
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array
  if(mousePressed){
  for(int i = 0; i < width; i++){
    rect(i, height, 1, arr[i]*-1);
  }

  //9. call the stepSort method
  stepSort(arr);
  }
  //10. extract the code that randomizes the array into a method.
  
  //11. call the method you made in step 10 when the mouse is pressed

}

void stepSort(float[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      float t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
