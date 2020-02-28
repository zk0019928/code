package ${pName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gzz.common.base.Page;

import java.util.stream.Collectors;

import javax.validation.Valid;
import com.xsrt.common.Result;

/**
 * @类说明 【${cName}】控制器
 * @author ${auth}
 * @date ${time}
 **/
//@Slf4j
@RestController
@RequestMapping("${lowUpp}")
public class ${upp}Controller {
 
	@Autowired
	private ${upp}Service service; //注入${cName}业务逻辑层

    /**
     * @方法说明  新增【${cName}】记录
     */
	@PostMapping("save")
	public Result save(@RequestBody @Valid ${upp} ${lowUpp}, BindingResult result) {
		if (result.hasErrors()) {
			return Result.error(1, "验证失败！", result.getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList()));
		}
		return Result.success(service.save(${lowUpp}));
	}

    /**
     * @方法说明 删除【${cName}】记录
     */
	@PostMapping("delete")
	public Result delete(${idType} ids[]) {
		return Result.success(service.delete(ids));
	}

    /**
     * @方法说明 修改【${cName}】记录
     */
	@PostMapping("update")
	public Result update(@RequestBody @Valid ${upp} ${lowUpp}, BindingResult result) {
		if (result.hasErrors()) {
			return Result.error(1, "验证失败！", result.getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList()));
		}
		return Result.success(service.update(${lowUpp}));
	}

    /**
     * @方法说明 按条件查询分页【${cName}】列表
     */
	@PostMapping("queryPage")
	public Result queryPage(@RequestBody ${upp}Cond cond ){
		return Result.success(service.queryPage(cond));
	}

    /**
     * @方法说明 按条件查询不分页【${cName}】列表
     */
	@PostMapping("queryList")
	public Result queryList(@RequestBody ${upp}Cond cond ){
		return Result.success(service.queryList(cond));
	}

    /**
     * @方法说明 按主键查单个【${cName}】记录
     */
	@PostMapping("findById")
	public Result findById(@RequestParam("id") ${idType} id) {
		return Result.success(service.findById(id));
	}

    /**
     * @方法说明 按条件查询【${cName}】记录个数
     */
	@PostMapping("queryCount")
	public Result queryCount(@RequestBody ${upp}Cond cond ){
		return Result.success(service.queryCount(cond));
	}
}