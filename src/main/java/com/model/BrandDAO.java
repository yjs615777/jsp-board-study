package com.model;

import java.util.ArrayList;
import java.util.List;

/*
  - 지금은 DB 없이 더미데이터
  - 나중에 MyBatis로 내부만 교체 예정
 */
public class BrandDAO {

    // 더미 데이터 저장소 (DB 대체)
    private static final List<BrandDTO> DATA = new ArrayList<>();

    // static 블록: 서버 뜰 때 한 번만 세팅
    static {
        DATA.add(new BrandDTO(1, "Nike", "Sportswear",
                "Global sports brand", "USA",
                1964, "Mid-High", "/images/nike.png", true));

        DATA.add(new BrandDTO(2, "Adidas", "Sportswear",
                "German sports brand", "Germany",
                1949, "Mid-High", "/images/adidas.png", true));

        DATA.add(new BrandDTO(3, "Uniqlo", "Casual",
                "Simple & functional", "Japan",
                1949, "Low-Mid", "/images/uniqlo.png", false));

        DATA.add(new BrandDTO(4, "Zara", "Fashion",
                "Fast fashion brand", "Spain",
                1975, "Mid", "/images/zara.png", false));
    }

    /* 전체 브랜드 조회 */
    public List<BrandDTO> findAll() {
        return new ArrayList<>(DATA); // 방어 복사
    }

    /* ID로 단건 조회 */
    public BrandDTO findById(int id) {
        for (BrandDTO brand : DATA) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }
}