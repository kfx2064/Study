package lec09.ex03.c;

public class CodeVo {
	
	private String codeNo;
	private String codeName;
	private String codeDetail;
	
	public CodeVo() {
		
	}
	
	public CodeVo(String codeNo, String codeName) {
		this.codeNo = codeNo;
		this.codeName = codeName;
	}

	public String getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeDetail() {
		return codeDetail;
	}

	public void setCodeDetail(String codeDetail) {
		this.codeDetail = codeDetail;
	}

	@Override
	public String toString() {
		return "CodeVo [codeNo=" + codeNo + ", codeName=" + codeName + ", codeDetail=" + codeDetail + "]";
	}
	
}
