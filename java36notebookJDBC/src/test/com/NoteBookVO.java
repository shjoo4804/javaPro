package test.com;

public class NoteBookVO {
	private int num;
	private String productNO;
	private String productName;
	private String modelName;
	private int price;

	public NoteBookVO() {
	}

	public NoteBookVO(int num, String productNO, String productName, String modelName, int price) {
		this.num = num;
		this.productNO = productNO;
		this.productName = productName;
		this.modelName = modelName;
		this.price = price;
	}

	// productNO setter/getter
	public void setProductNO(String productNO) {
		this.productNO = productNO;
	}

	public String getProductNO() {
		return productNO;
	}

	// productName setter/getter
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	// modelName setter/getter
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	// price setter/getter
	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	// num setter/getter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
