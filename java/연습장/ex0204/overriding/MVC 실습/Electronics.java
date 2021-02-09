public class Electronics {
	private int modelNo;
	private String modelName;
	private int modelPrice;
	private String modelDetail;

	Electronics() {
		this(0, null, 0, null);
	}

	Electronics(int modelNo) {
		this.modelNo = modelNo;
	} 
	Electronics(int modelNo, String modelDetail) {
		this(modelNo);
		this.modelDetail = modelDetail;
	}

	Electronics(int modelNo, String modelName, int modelPrice, String modelDetail) {
		this(modelNo, modelDetail);
		this.modelName = modelName;
		this.modelPrice = modelPrice;
	}
	
	public void setModelNo(int modelNo) { this.modelNo = modelNo; }
	public void setModelName(String modelName) { this.modelName = modelName; }
	public void setModelPrice(int modelPrice) { this.modelPrice = modelPrice; }
	public void setModelDetail(String modelDetail) { this.modelDetail = modelDetail; }
	public int getModelNo() { return modelNo; }
	public String getModelName() { return modelName; }
	public int getModelPrice() { return modelPrice; }
	public String getModelDetail() { return modelDetail; }
	
	@Override
	public String toString() { return modelNo + "\t" + modelName + "\t" +modelPrice + "\t" + modelDetail; }
}