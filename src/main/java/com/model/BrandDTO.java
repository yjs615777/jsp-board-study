package com.model;

public class BrandDTO {
	 	private int id;              // 브랜드 고유 ID (Primary Key 역할)
	    private String name;         // 브랜드명 (예: "CHANEL")
	    private String category;     // 카테고리 (예: "Luxury")
	    private String description;  // 브랜드 설명 (긴 텍스트)
	    private String country;      // 원산지 국가 (예: "France")
	    private int foundedYear;     // 설립 연도 (예: 1910)
	    private String priceRange;   // 가격대 표시 (예: "$$$$$")
	    private String imageUrl;     // 이미지 파일명 (예: "chanel.jpg")
	    private boolean featured;    // 메인 페이지 노출 여부 (true/false)
	
	    //기본 생성자 (No-Argument Constructor)
    public BrandDTO() {}
    
    /** 전체 생성자 (All-Arguments Constructor)
     
     - 모든 값을 한 번에 설정할 수 있어서 편리
     - DAO에서 객체 생성 시 코드가 간결해짐
     
      사용 예:
      BrandDTO brand = new BrandDTO(
          1, "CHANEL", "Luxury", 
          "프랑스 럭셔리 브랜드",
          "France", 1910, "$$$$$", 
          "chanel.jpg", true
      );
    **/
    public BrandDTO(int id, String name, String category, String description, 
                   String country, int foundedYear, String priceRange, String imageUrl, boolean featured) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.country = country;
        this.foundedYear = foundedYear;
        this.priceRange = priceRange;
        this.imageUrl = imageUrl;
        this.featured = featured;
    }
    
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    //브랜드명 가져오기
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    //카테고리 가져오기
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    //브랜드 설명 가져오기
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    //원산지 국가 가져오기
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    //설립 연도 가져오기
    public int getFoundedYear() { return foundedYear; }
    public void setFoundedYear(int foundedYear) { this.foundedYear = foundedYear; }
    //가격대 가져오기
    public String getPriceRange() { return priceRange; }
    public void setPriceRange(String priceRange) { this.priceRange = priceRange; }
    //이미지 경로 가져오기
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    //메인 노출 여부 확인 true:메인 노출 false:일반
    public boolean isFeatured() { return featured; }
    public void setFeatured(boolean featured) { this.featured = featured; }
}