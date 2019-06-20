package com.bitcamp.web.common.util;

import java.util.Map;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
@RestController
@Component @Data @Lazy //파라매터로줄때 컴포넌트
public class PageProxy {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customerDTO;
                
    private int pageNum,pageSize,blockSize,startRow,endRow,startPage,endPage,prevBlock,nextBlock,totalCount;
    private String search;
    private boolean existPrev, existNext; //페이지넘버에서 일정량 넘엇을떄 화살표

    
    public void execute(Map<?,?> paramMap) {  // ?,? 는 아무거나 받을수가있다 명칭은 와일드카드 
            String _pageNum = (String)paramMap.get("page_num");{ // (((    내부에서 만 처리하는 변수 _   ))))
            pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum);
            String _pageSize = (String)paramMap.get("page_size");
            pageSize = (_pageNum == null) ? 5 : Integer.parseInt(_pageSize);
            // block 기본값 5 
            //totalCount = DB에 있는 테이블 

           

            // startRow

            //endRow
        }
    }


    
}