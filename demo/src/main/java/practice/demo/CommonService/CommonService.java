package practice.demo.CommonService;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import practice.demo.Repository.CommonRepository;

@Service
@RequiredArgsConstructor
public class CommonService {

    private final CommonRepository commonRepository;

    public Page<PostResponseDto> paging(Pageable pageable) {
        int page = pageable.getPageNumber - 1;
        int pageLimit = 3;
        //페이지네이션 핵심
        page<Posts> postPages = commonRepository.findAll(PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.DESC, "idd")))//
        // 이 페이지네이션에 들어가있는것을 dto로 묶어서 response 로 보내야함

        page<PostResponseDto> postResponseDtos = postPages.map(
                postPage -> new PostResponseDto(postPage)
        );

        return asdfas;

    }


}
