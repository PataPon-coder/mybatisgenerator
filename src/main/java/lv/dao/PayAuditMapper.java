package lv.dao;

import lv.model.PayAudit;

public interface PayAuditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayAudit record);

    int insertSelective(PayAudit record);

    PayAudit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayAudit record);

    int updateByPrimaryKey(PayAudit record);
}