package ribbitPack;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.*;
public class Utilities{
    public static ImageIcon scaleImage(ImageIcon image,int newWidth,int newHeight){
        Image newImage = image.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(newImage);
    }

    public static int getRandomInt(int lowerBound, int upperBound){
        return (int)((lowerBound)+(Math.random()*(upperBound-lowerBound+1)));
    }

    // pick random number based on lottery ticket system 
    // outputs a number from 0 to amount of ticket specifications minus 1 
    public static int getWeightedRandom(int[] ticketCounts){
        int totalProbabilityTickets = 0; 
        for (int i =0; i<ticketCounts.length;i++){
            totalProbabilityTickets += ticketCounts[i];
        }
        int randNum = (int)(Math.random()*totalProbabilityTickets);
        for (int i = 0; i< ticketCounts.length ;i++){
            if (randNum < ticketCounts[i]){
                return i; 
            } else {
                randNum -= ticketCounts[i];
            }
        }
        return -1; // mathamatically impossible, unless array is empty
    }

    public static boolean isInRangeInclusive(int lowerBound, int upperBound, int input ){
            return ((lowerBound<=input)&&(upperBound>=input)); 
    }

    public static String cleanString(String input){
        String cleanedString = "";
        for (char i: input.toCharArray()){
            if (Character.isLetterOrDigit(i) || Character.isWhitespace(i)){
                cleanedString+=Character.toLowerCase(i); 
            }
        }
        return cleanedString;
    }

    // Don't remember 100% but this might be a code snippet taken from somewhere
    public static BufferedImage iconToBufferedImage(ImageIcon icon){
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = bufferedImage.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();
        return bufferedImage;
    }

    // determines if distance between two points exceeds a maximum distance parameter 
    public static boolean withinRange(int[] coords, int[] coords2, int maxDistance){
        int distance = (int)(Math.sqrt(Math.pow((coords2[0]-coords[0]),2)+Math.pow((coords2[1]-coords[1]),2)));
        return (distance <= maxDistance);
    }

    private Utilities(){}
}