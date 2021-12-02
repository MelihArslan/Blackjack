package nl.meliharslan.ewa.database.utilities;

import nl.meliharslan.ewa.database.domein.Player;
import nl.meliharslan.ewa.database.domein.dto.PlayerDTO;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

@Component
public class CustomModelMapper {


    ModelMapper modelMapper = new ModelMapper();

    public Player convertFromPlayerDTO(PlayerDTO playerDTO) {
        return modelMapper.map(playerDTO, Player.class);
    }

    public PlayerDTO convertFromPlayer(Player player) {
        modelMapper = new org.modelmapper.ModelMapper();
        return modelMapper.map(player, PlayerDTO.class);
    }

    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
