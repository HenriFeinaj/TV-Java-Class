 public class TestTV {
	public static void main(String[] args) {
		TV tv[] = new TV[5];
		
		tv[0] = new TV();
		tv[1] = new TV();
		tv[2] = new TV(50);
		tv[3] = new TV();
		tv[4] = new TV();
		
		
		//GETTING CHANNELS AND VOLUME.
		
		//GETTING SERIAL NUMBER SECTION.
		
		System.out.println("The serial number for 1st TV: " + tv[0].getSerialNumber());
		System.out.println("The serial number for 2nd TV: " + tv[1].getSerialNumber());
		System.out.println("The serial number for 3rd TV: " + tv[2].getSerialNumber());
		System.out.println("The serial number for 4th TV: " + tv[3].getSerialNumber());
		System.out.println("The serial number for 5th TV: " + tv[4].getSerialNumber());
		System.out.println("");
		
		
		tv[0].toggle();
		tv[0].setChannel(1);
		
		System.out.println("TV1's channel is " + tv[0].getChannel() + " and volume level is " + tv[0].getVolume() + "%");  //Printing out the initial values set for TV1.
		
		tv[0].channelUp();               //Channel Increase by 1 for the first TV,
		//tv[0].channelDown();           //Channel Decrease by 1 for the first TV,
		tv[0].volumeUp();                //Volume Increase by 2 for the first TV,
		//tv[0].volumeDown();            //Volume Decrease by 2 for the first TV,
	
		tv[1].toggle();
		tv[1].getVolume();
		tv[1].setChannel(1);
		
		System.out.println("TV2's channel is " + tv[1].getChannel() + " and volume level is " + tv[1].getVolume() + "%");  //Printing out the initial values set for TV2.
		
		tv[1].channelUp();            //Channel Increase by 1 for the second TV,									    
		//tv[1].channelDown();            //Channel Decrease by 1 for the second TV,
		//tv[1].volumeUp();             //Volume Increase by 2 for the second TV,
		tv[1].volumeDown();             //Volume Decrease by 2 for the second TV.
		
		tv[2].toggle();
		tv[2].setChannel(1);
		
		System.out.println("TV3's channel is " + tv[2].getChannel() + " and volume level is " + tv[2].getVolume() + "%");  //Printing out the initial values set for TV3.
		
		tv[2].channelUp();               //Channel Increase by 1 for the third TV,
		//tv[2].channelDown();           //Channel Decrease by 1 for the third TV,
		tv[2].volumeUp();                //Volume Increase by 2 for the third TV,
		//tv[2].volumeDown();            //Volume Decrease by 2 for the third TV,
	
		tv[3].toggle();
		tv[3].setChannel(1);
		
		System.out.println("TV4's channel is " + tv[3].getChannel() + " and volume level is " + tv[3].getVolume() + "%");  //Printing out the initial values set for TV4.
		
		tv[3].channelUp();            //Channel Increase by 1 for the fourth TV,									    
		//tv[3].channelDown();            //Channel Decrease by 1 for the fourth TV,
		//tv[3].volumeUp();             //Volume Increase by 2 for the fourth TV,
		tv[3].volumeDown();             //Volume Decrease by 2 for the fourth TV.
		
		
		tv[4].toggle();
		tv[4].setChannel(1);
		
		tv[4] = tv[2]; //TASK 2.3 FOR INCREMENT OF BOTH TV[2] AND TV[4].
		
		
		System.out.println("TV5's channel is " + tv[4].getChannel() + " and volume level is " + tv[4].getVolume() + "%");  //Printing out the initial values set for TV5.
		
		
		tv[4].channelUp();            //Channel Increase by 1 for the fifth TV,									    
		//TV[4].channelDown();            //Channel Decrease by 1 for the fifth TV,
		//TV[4].volumeUp();             //Volume Increase by 2 for the fifth TV,
		tv[4].volumeDown();             //Volume Decrease by 2 for the fifth TV.
		
		
		
		/* EXAMPLE TEST OUTPUT AFTER THE ALTERATIONS ON CHANNELS AND VOLUME PERCENTAGES.
		*/
		
		System.out.println("");
		System.out.println("TV1's channel changed to " + tv[0].getChannel() + " and volume changed to " + tv[0].getVolume() + "%");
		System.out.println("TV2's channel changed to " + tv[1].getChannel() + " and volume changed to " + tv[1].getVolume() + "%");
		System.out.println("TV3's channel changed to " + tv[2].getChannel() + " and volume changed to " + tv[2].getVolume() + "%");
		System.out.println("TV4's channel changed to " + tv[3].getChannel() + " and volume changed to " + tv[3].getVolume() + "%" + " This remains the same for TASK 2.3");
		System.out.println("TV5's channel changed to " + tv[4].getChannel() + " and volume changed to " + tv[4].getVolume() + "%");
		
		
		
		/* EXAMPLES WHEN THE TVs ARE TURNED OFF AND WE TRY TO IMPLEMENT CHANGES IN CHANNELS OR VOLUME
		   IN THE END, BECAUSE THE TVs ARE OUT OF OPERATION THE CHANGES NEVER OCCUR.
		*/
		
		
		tv[0].toggle();
		tv[1].toggle();
		tv[2].toggle();
		tv[3].toggle();
		tv[4].toggle();
		
		
		//EXAMPLE ALTERATION THAT NEVER OCCURS DUE TO THE TV BEING TURNED OFF.
		
		tv[0].channelDown();
		tv[1].channelUp();
		tv[2].volumeUp();
		tv[3].channelDown();
		tv[4].channelUp();
		
		System.out.println("");
		System.out.println("THE TV IS OFF AND THE SETTINGS REMAIN WITHOUT ALTERATIONS AS BEFORE");
		System.out.println("");
		System.out.println("TV1's channel changed to " + tv[0].getChannel() + " and volume changed to " + tv[0].getVolume() + "%");
		System.out.println("TV2's channel changed to " + tv[1].getChannel() + " and volume changed to " + tv[1].getVolume() + "%");
		System.out.println("TV3's channel changed to " + tv[2].getChannel() + " and volume changed to " + tv[2].getVolume() + "%");
		System.out.println("TV4's channel changed to " + tv[3].getChannel() + " and volume changed to " + tv[3].getVolume() + "%" + " This remains the same for TASK 2.3");
		System.out.println("TV5's channel changed to " + tv[4].getChannel() + " and volume changed to " + tv[4].getVolume() + "%");
		
		
	}
}