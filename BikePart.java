

public class BikePart {
	private double listPrice;
	private double salesPrice;
	private int partNumber;
	private int quantity;
	private String partName;
	private boolean onSale;
	
	public BikePart(String name, int partNum, double list,double sales, boolean onSale) {
		this.partName=name;
		this.partNumber=partNum;
		this.listPrice=list;
		this.salesPrice=sales;
		this.onSale=onSale;
		
	}
	
	public BikePart(String csv) {
		this.partName=csv.split(",")[0];
		this.partNumber=Integer.parseInt(csv.split(",")[1]);
		
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(float listPrice) {
		this.listPrice = listPrice;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(float salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

}
