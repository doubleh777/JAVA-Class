package dataio;

public class Client {
	
	private int iDNumber;
	private String name;
	private int stationArrivingTime;
	private int ticketingTurnaroundTime;
	private String departure;
	private String destination;
	private int ticketingWaitingTime;
	private int trainWaitingTime;
	private int destinationArrivingTime;
	
	
	public Client(int iDNumber, String name, int stationArrivingTime,
										int ticketingTurnaroundTime, String departure, String destination){
		
		this.iDNumber = iDNumber;
		this.name = name;
		this.stationArrivingTime = stationArrivingTime;
		this.ticketingTurnaroundTime = ticketingTurnaroundTime;
		this.departure = departure;
		this.destination = destination;
	}
//출력시 계산되어 출력되어야 하는 정보에 대한 getter $ setter
	public int getTicketingWaitingTime() {
		return ticketingWaitingTime;
	}
	public void setTicketingWaitingTime(int ticketingWaitingTime) {
		this.ticketingWaitingTime = ticketingWaitingTime;
	}
	public int getTrainWaitingTime() {
		return trainWaitingTime;
	}
	public void setTrainWaitingTime(int trainWaitingTime) {
		this.trainWaitingTime = trainWaitingTime;
	}
	public int getDestinationArrivingTime() {
		return destinationArrivingTime;
	}
	public void setDestinationArrivingTime(int destinationArrivingTime) {
		this.destinationArrivingTime = destinationArrivingTime;
	}

	
	//Data파일로 부터 읽어온 정보에 대한 getter
	public int getiDNumber() {
		return iDNumber;
	}
	public String getName() {
		return name;
	}
	public int getStationArrivingTime() {
		return stationArrivingTime;
	}
	public int getTicketingTurnaroundTime() {
		return ticketingTurnaroundTime;
	}
	public String getDeparture() {
		return departure;
	}
	public String getDestination() {
		return destination;
	}

	
}
