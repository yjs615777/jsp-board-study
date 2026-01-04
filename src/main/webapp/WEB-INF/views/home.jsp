<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>BrandRate</title>

  <!-- 공통 먼저, 페이지 CSS는 나중 -->
  <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/common.css">
  <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/home.css">
</head>
<body>
  <header class="header">
    <div class="header__inner">
      <a class="logo" href="<%= request.getContextPath() %>/">BrandRate</a>

      <nav class="nav">
        <a href="<%= request.getContextPath() %>/brands">Brands</a>
        <a href="<%= request.getContextPath() %>/rank">Rank</a>
        <a href="<%= request.getContextPath() %>/reviews">Reviews</a>
      </nav>

      <div class="auth">
        <a class="btn btn--ghost" href="<%= request.getContextPath() %>/login">Login</a>
        <a class="btn btn--primary" href="<%= request.getContextPath() %>/brands/new">Add Brand</a>
      </div>
    </div>
  </header>

  <main class="main">
    <section class="hero">
      <h1 class="hero__title">브랜드를 검색하고, 평가하고, 비교하세요</h1>
      <p class="hero__desc">DB 기반으로 브랜드 정보와 리뷰/평점을 한눈에.</p>

      <div class="search">
        <input id="q" class="search__input" type="text" placeholder="브랜드명 검색 (예: Nike, 다이소)" />
        <select id="sort" class="search__select">
          <option value="popular">인기순</option>
          <option value="rating">평점순</option>
          <option value="recent">최신순</option>
        </select>
        <button id="btnSearch" class="btn btn--primary" type="button">검색</button>
      </div>

      <div class="chips">
        <button class="chip is-active" data-cat="all" type="button">전체</button>
        <button class="chip" data-cat="fashion" type="button">패션</button>
        <button class="chip" data-cat="food" type="button">푸드</button>
        <button class="chip" data-cat="beauty" type="button">뷰티</button>
        <button class="chip" data-cat="tech" type="button">테크</button>
      </div>
    </section>

    <section class="grid">
      <article class="card">
        <div class="card__top">
          <div class="badge">TOP</div>
          <div class="rating">
            <span class="rating__star">★</span>
            <span class="rating__value">4.6</span>
            <span class="rating__meta">(리뷰 128)</span>
          </div>
        </div>
        <h3 class="card__title">Nike</h3>
        <p class="card__desc">러닝/스포츠웨어 · 공식몰 · 오프라인 매장</p>
        <div class="card__actions">
          <a class="btn btn--ghost" href="<%= request.getContextPath() %>/brands/1">상세</a>
          <a class="btn btn--primary" href="<%= request.getContextPath() %>/brands/1/review/new">리뷰쓰기</a>
        </div>
      </article>

      <article class="card">
        <div class="card__top">
          <div class="badge badge--muted">NEW</div>
          <div class="rating">
            <span class="rating__star">★</span>
            <span class="rating__value">4.1</span>
            <span class="rating__meta">(리뷰 44)</span>
          </div>
        </div>
        <h3 class="card__title">다이소</h3>
        <p class="card__desc">생활/잡화 · 가성비 · 전국 매장</p>
        <div class="card__actions">
          <a class="btn btn--ghost" href="<%= request.getContextPath() %>/brands/2">상세</a>
          <a class="btn btn--primary" href="<%= request.getContextPath() %>/brands/2/review/new">리뷰쓰기</a>
        </div>
      </article>
    </section>
  </main>

  <script src="<%= request.getContextPath() %>/resources/js/home.js"></script>
</body>
</html>
