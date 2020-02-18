 public class TV {
	private int channel = 1; // Default channel is 1.
	private int volumeLevel = 0; // Default volume level is 0.
	private boolean power = false; // TV is off.
	private int availableChannels;
	private static int serialNo = 1000;
	private int serialNumber;

	public TV(int channelLimit) {
		serialNumber = serialNo;
		serialNo++;
		
		availableChannels = channelLimit;
	}
	public TV() {
		serialNumber = serialNo;
		serialNo++;
		
		availableChannels = 10;
	}

	public void toggle() {
		power = !power;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volumeLevel;
	}
	
	public void setChannel(int newChannel) {
		if (power && newChannel >= 1 && newChannel <= availableChannels) {   
		
			/**
				*Checking if the TV is on and checking the range of the channels,
				--No issues encountered whatsoever.
			*/
			
			channel = newChannel;
		}
	}

	public void channelUp() {
		if (power && channel < availableChannels) {
			
			/**
				*Checking if the TV is on and that the channels are less than 100,
				Lastly, it increases the channel by 1.
				--No issues encountered whatsoever.
			*/
			
			channel = channel + 1 ;
		}
	}

	public void channelDown() {
		if (power && channel > 1) {
			
			/**
				*Checking if the TV is on and that the channels are more than 1,
				Lastly, it decreases the channel by 1.
				--No issues encountered whatsoever.
			*/
			
			channel = channel - 1;
		}
	}

	public void volumeUp() {
		if (power && volumeLevel < 100) {
			
			/**
				*Checking if the TV is on and that the Volume is less than 100 %,
				Lastly, it increases the volume by 2 %.
				--No issues encountered whatsoever.
			*/
			
			volumeLevel = volumeLevel + 2;
		}
	}

	public void volumeDown() {
		if (power && volumeLevel > 1) {
			
			/**
				*Checking if the TV is on and that the Volume is more than 1 %,
				Lastly, it decreases the volume by 2 %.
				--No issues encountered whatsoever.
			*/
			
			volumeLevel = volumeLevel - 2;
		}
	}
}