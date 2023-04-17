package kr.co.softsoldesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softsoldesk.db.MapperInterface;
import kr.co.softsoldesk.mapper.vo.ProductVO;

//unchecked : 검증되지 않은 연산자 관련 경고 억제
//rawtypes : 제네릭 (데이터 형식에 의존하지 않고 갖고 올 수 있게 여러 타입을 참고)
@SuppressWarnings({"unchecked" , "rawtypes"})
@RestController//@Controller + @ResponseBody
public class ProductController {

	@Autowired
	private MapperInterface productMapper;
	
	@GetMapping("/products")
	public List getAllProductList() {
		System.out.println("Request Method : GET 성공!");
		return productMapper.getAllProductList();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity findProductById(@PathVariable("id") String id) {
		
		System.out.println("Request Method : GET 성공!");
		ProductVO product = productMapper.findProductById(id);
		
		if(product == null) {
			return new ResponseEntity("상품이 존재하지 않습니다.", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity(product,HttpStatus.OK);
	}
	
	//값을 가져오기 때문에 value로 받음
	@PostMapping(value ="/products")
	public ResponseEntity registerProduct(ProductVO productvo) {
		System.out.println("Request Method : POST 성공!");
		productMapper.registerProduct(productvo);
		return new ResponseEntity(productvo.getId()+" "+productvo.getName()+"상품등록 완료!",HttpStatus.OK);
	}
	
	@PutMapping("/products")
	public ResponseEntity updateProduct(ProductVO productvo) {
		System.out.println("Request Method : PUT 성공!" + productvo);
		int result = productMapper.updateProduct(productvo);
		
		if(result==0) {
			return new ResponseEntity(productvo.getId()+"번 상품이 없으므로 수정 불가",HttpStatus.OK);
		}
		
		return new ResponseEntity(productvo.getId()+"번 상품 수정 완료",HttpStatus.OK);
	}
	
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity deleteProductById(@PathVariable String id) {
		System.out.println(id+"번 삭제 성공!");
		productMapper.deleteProduct(id);
		
		return new ResponseEntity(id+"번 상품 삭제완료",HttpStatus.OK);
	}
	
	
}
