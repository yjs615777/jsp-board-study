document.addEventListener("DOMContentLoaded", () => {
  console.log("✅ home.js loaded");

  const q = document.getElementById("q");
  const sort = document.getElementById("sort");
  const btnSearch = document.getElementById("btnSearch");
  const chips = document.querySelectorAll(".chip");

  console.log({ q, sort, btnSearch, chipsCount: chips.length });

  // 요소 못 찾으면 여기서 바로 잡힘
  if (!q || !sort || !btnSearch) {
    console.error("❌ 필요한 요소를 못 찾음. id(q, sort, btnSearch) 확인!");
    return;
  }

  let category = "all";

  chips.forEach((chip) => {
    chip.addEventListener("click", () => {
      chips.forEach(c => c.classList.remove("is-active"));
      chip.classList.add("is-active");
      category = chip.dataset.cat || "all";
    });
  });

  const goSearch = () => {
    const keyword = (q.value || "").trim();

    const params = new URLSearchParams({
      q: keyword,
      sort: sort.value,
      cat: category
    });

    // 일단 동작 확인용 alert
    alert(`검색: ${keyword}, 정렬: ${sort.value}, 카테고리: ${category}`);

    // 실제 이동은 아래로
    // location.href = `${getContextPath()}/brands?${params.toString()}`;
  };

  btnSearch.addEventListener("click", goSearch);

  q.addEventListener("keydown", (e) => {
    if (e.key === "Enter") goSearch();
  });
});

// contextPath 계산
function getContextPath() {
  const path = location.pathname;
  const idx = path.indexOf("/", 1);
  return idx === -1 ? "" : path.substring(0, idx);
}
