package kodlama.io.rentACar.core.utilities.mappers;
//strateji oluşturmak için . db gelen herşeyi map etmek zorunda değilim.
//ama bir request geldiğinde herşeyi map etmek isteyebilirim.

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
ModelMapper forResponse();
ModelMapper forRequest();
}
