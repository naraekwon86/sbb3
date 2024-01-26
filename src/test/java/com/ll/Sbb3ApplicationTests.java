package com.ll;

import com.ll.sbb3.answer.Answer;
import com.ll.sbb3.answer.AnswerRepository;
import com.ll.sbb3.question.Question;
import com.ll.sbb3.question.QuestionRepository;
import com.ll.sbb3.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class Sbb3ApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for(int i = 1 ; i <= 300; i++){
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject,content);
        }


    }

}
