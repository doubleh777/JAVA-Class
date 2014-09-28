package dataio;

public class Client implements Comparable{
	
	private int iDNumber;
	private String name;
	private int stationArrivingTime;
	private int ticketingTurnaroundTime;
	private String departure;
	private String destination;
	private int trainDepartureTime;
	private int trainArrivingTime;
	private int endOfTicketingTime;
	private int startOfTicketingTime;
	private int trainTurnaroundTime;
	
	private int ticketingWaitingTime;
	private int trainWaitingTime;
	
	
	public Client(int iDNumber, String name, int stationArrivingTime,
										int ticketingTurnaroundTime, String departure, String destination){
		
		this.iDNumber = iDNumber;
		this.name = name;
		this.stationArrivingTime = stationArrivingTime;
		this.ticketingTurnaroundTime = ticketingTurnaroundTime;
		this.departure = departure;
		this.destination = destination;
	}
//��½� ���Ǿ� ��µǾ�� �ϴ� ������ ���� getter $ setter
	public int getTrainTurnaroundTime() {
		return trainTurnaroundTime;
	}
	public void setTrainTurnaroundTime(int trainTurnaroundTime) {
		this.trainTurnaroundTime = trainTurnaroundTime;
	}
	public int getDestinationArrivingTime() {
		return trainArrivingTime;
	}
	public int getTrainDepartureTime(){
		return trainDepartureTime;
	}
	public void setTrainDepartureTime(int trainDepartureTime){
		this.trainDepartureTime = trainDepartureTime;
	}
	public int getEndOfTicketingTime(){
		return endOfTicketingTime;
	}
	public void setEndOfTicketingTime(int endOfTicketingTime){
		this.endOfTicketingTime = endOfTicketingTime;
	}
	public void calculateWaitingTime(){
		ticketingWaitingTime = startOfTicketingTime - stationArrivingTime;
		trainWaitingTime = trainDepartureTime - endOfTicketingTime;
		trainArrivingTime = trainDepartureTime + trainTurnaroundTime;
		
	}
	public int getStartOfTicketingTime(){
		return startOfTicketingTime;
	}
	public void setStartOfTicketingTime(int startOfTicketingTime){
		this.startOfTicketingTime = startOfTicketingTime;
	}
	
	//Data���Ϸ� ���� �о�� ������ ���� getter
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
	
	public String toString(){
		return iDNumber+", "+name+", "+stationArrivingTime+", "+ ticketingTurnaroundTime+", "+ departure + ", " + destination+", "+trainDepartureTime+", "+ticketingWaitingTime+", "+trainWaitingTime+", "+ trainArrivingTime;
	}

	public int compareTo(Object o) {
		return this.getTicketingTurnaroundTime() - ((Client)o).getTicketingTurnaroundTime();
	}

	public String getInfo(){
		return iDNumber+", "+name+", "+stationArrivingTime+", "+ ticketingTurnaroundTime+", "+ departure + ", " + destination+", "+trainDepartureTime+", "+ticketingWaitingTime+", "+trainWaitingTime+", "+ trainArrivingTime;
	}

	
}
