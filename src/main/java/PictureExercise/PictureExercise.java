package PictureExercise;

public class PictureExercise
{
    public static void main(String[] args)
    {    	
        // If you want to not have to pick the image each time, fill in the correct address in the next line and delete the "//" 
        // Picture clouds = new Picture("C:\\Pictures\\...");
        Picture myPicture = new Picture();
        myPicture.pick();
        // Use Picture methods to draw your picture object HERE
        myPicture.draw();

        // Use Picture methods & print\println to print out the height and width of your picture HERE
        int width = myPicture.getWidth();
        int height = myPicture.getHeight();

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        // challenge to resize image to full screen
        double maxWidth = myPicture.getMaxX();
        double maxHeight = myPicture.getMaxY();
        System.out.println(maxWidth + ", " + maxHeight);
        myPicture.grow(maxWidth - width, maxHeight - height);
    }
}
