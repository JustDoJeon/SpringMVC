package mvc.spring.web.frontcontroller.v4.controller;

import mvc.spring.domain.member.Member;
import mvc.spring.domain.member.MemberRepository;
import mvc.spring.web.frontcontroller.ModelView;
import mvc.spring.web.frontcontroller.v3.ControllerV3;
import mvc.spring.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();

        model.put("members",members);
        return "members";

    }
}
