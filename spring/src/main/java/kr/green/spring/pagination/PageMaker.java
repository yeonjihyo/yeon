package kr.green.spring.pagination;

public class PageMaker {
	private int totalCount;//endPage를 계산하기 위해서 전체 게시글 갯수가 필요
	private int startPage;//페이지네이션의 시작 번호
	private int endPage; //페이지네이션의 끝 번호
	private boolean prev;//이전버튼 활성화
	private boolean next;//다음버튼 활성화
	private int displayPageNum;//페이지네이션의 페이지 갯수 
	private Criteria criteria;//현재 페이지 정보 
	
	/* endPage, startPage, prev, next 값 계산 */
	public void calcData() {//totalCount가  정해지고 나서 이 메소드는 setTotalCount에서 실행
		/* starPage와 endPage는 현재 페이지 정보인 criteria와 displayPageNum을 이용하여 계산
		 * displayPageNum이 10이고 현재 페이지가 31페이지면 startPage = 31, endPage = 40이 되도록 계산 */
		endPage = (int) (Math.ceil(criteria.getPage()/(double) displayPageNum)*displayPageNum);
		//ceil : 올림을 하는 함수 
		//현재페이지정보를 가져와서 갯수로 나눔 
		//endPage = 40
		
		startPage = (endPage - displayPageNum)+1;
		//startPage =31
		
		/* 총 콘텐츠 갯수를 이용하여 마지막 페이지 번호를 계산 */
		//perPageNum=15 
		//totalCount=563
		
		int tempEndPage = (int)(Math.ceil(totalCount/(double)criteria.getPerPageNum()));
		//tempEndPage = 38
		/* 현재 페이지에 계산된 현재 페이지메이커의 마지막 페이지 번호와 실제 마지막 페이지 번호를 비교하여
		 * 작은 값이 마지막 페이지 번호가 됨 */
		if(endPage > tempEndPage) {
			endPage = tempEndPage;
			//endPage = 38
		}
		/* 현재 페이지메이커에 시작페이지가 1페이지면 prev가 없어야 함 */
		prev = startPage == 1 ? false : true;
		/* 현재 페이지메이커에 마지막 페이지에 컨텐츠의 마지막이 포함되어 있으면 next가 없어야 함 */
		next = endPage * criteria.getPerPageNum() >= totalCount ? false:true;
	}
	/* getter and setter */
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	public Criteria getCriteria() {
		return criteria;
	}
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	@Override
	public String toString() {
		return "PageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
				+ prev + ", next=" + next + ", displayPageNum=" + displayPageNum + ", criteria=" + criteria + "]";
	}
}
