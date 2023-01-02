package site.zhangerfa.service.impl;

import site.zhangerfa.dao.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zhangerfa.pojo.Card;
import site.zhangerfa.service.CardService;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardMapper cardMapper;

    @Override
    public List<Card> getOnePageCardsByStuId(String stuId, int page) {
        return cardMapper.selectOnePageCardsByStuId(stuId, page);
    }

    @Override
    public boolean add(Card card) {
        int addNum = cardMapper.addCard(card);
        System.out.println(card);
        return addNum != 0;
    }

    @Override
    public List<Card> getOnePageCards(int page) {
        return cardMapper.selectOnePageCards(page);
    }
}