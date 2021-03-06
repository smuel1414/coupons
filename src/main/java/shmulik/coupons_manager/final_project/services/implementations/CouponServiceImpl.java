package shmulik.coupons_manager.final_project.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shmulik.coupons_manager.final_project.entities.Coupon;
import shmulik.coupons_manager.final_project.repositories.CouponRepo;
import shmulik.coupons_manager.final_project.services.interfaces.CouponService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepo couponRepo;

    @Override
    public List<Coupon> findAll() {
        return couponRepo.findAll();
    }


    @Override
    public Coupon findById(long id) {
        Optional<Coupon> optinal =   couponRepo.findById(id);
        return optinal.orElse(null);
    }

    @Override
    @Transactional
    public Coupon createCoupon(Coupon coupon) {
        couponRepo.save(coupon);
        return coupon;
    }

    @Override
    @Transactional
    public Coupon updateCoupon(Coupon coupon) {
        couponRepo.save(coupon);
        return coupon;
    }

    @Override
    @Transactional
    public boolean deleteCouponById(long id) {
        if(!couponRepo.findById(id).isPresent()) {
            return false;
        }
        else {
            couponRepo.deleteById(id);
            return true;
        }
    }
}
