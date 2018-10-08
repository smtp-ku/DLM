# DLM

0. 개요

개인적 활용을 위한 File I/O GUI 모듈 제작

1. 기능

> 1.1. Random Chooser

	사용자가 선택한 경로 하위의 모든 파일에 대한 리스트를 생성한 후, 입력된 Roll Count만큼 랜덤을 파일을 선택하여 화면에 표시함
	+ 랜덤 선택할 파일의 확장자를 정할 수 있도록 변경
	+ 이미지, 동영상, 압축파일, 음악 포맷에 대한 확장자를 로드하도록 변경
	+ 이미지, 압축파일에 대하여 이미지뷰어 연동 기능, 동영상 파일에 대하여 미디어 플레이어 연동 기능 추가
	+ 연동기능에 대하여 키보드 입력 추가
	+ zip 확장자 및 이미지 확장자에 대한 썸네일 미리보기 추가
	+ Del키와 F5를 이용하여 정리가 필요한 파일을 따로 분류하도록 하는 기능 추가

> 1.2. Categorizer

	파일명을 기반으로 분류가 되지 않을 파일을 정해진 분류에 따라서 분류함
	트리구조를 통한 미리보기를 통해 어떻게 분류가 되는지 미리 보여줌
	분류 정책이 좀더 효율적이도록 대문자 처리 정책 및 파일개수 제한 정책 추가
	
	전체적인 구조변경 예정
	분류규칙 적용범위 확대 및 자동압축/자동분류 알고리즘 대대적 변경(예정)
	
> 1.3. Hiyobi Downloader

	Hiyobi에 업로드된 만화를 자동으로 다운로드하는 모듈
	+ 다운로드한 만화의 ID를 로그에 저장하면 스킵하도록 변경
	+ 진행상황 확인가능하도록 구조 변경
	+ Thread 활용한 다운로드 속도 개선
	+ UI 개선 및 Thread 방식 다운로드 문제점 개선
	+ 다운로드 및 압축 완료 후 더미 파일 미삭제 문제(예정)
	
> 1.4. Trend Checker

	자주 방문하는 웹사이트의 최신 게시물을 모아서 보여주는 모듈
	+ 더블클릭 시 자동으로 체크되며, 체크된 링크는 나중에 DB에 등록하여 두번 방문하지 않도록 변경
	+ 다중 선택 및 우클릭시 체크하는 기능 추가
	+ 북마크 기능 추가
	+ 후방관련 기능 추가(예정)
	
> 1.5. 기타
	
	.exe 실행 파일 제작 확인(예정)
	편의성 기능 추가 조사(예정)
	서버 연동 기능 조사(예정)
	모바일 버전 제작 조사(예정)
	딥러닝 관련 기능 제작 조사(예정)
