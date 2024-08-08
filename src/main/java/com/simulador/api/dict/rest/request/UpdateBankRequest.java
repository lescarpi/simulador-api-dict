package com.simulador.api.dict.rest.request;

import java.util.UUID;

public record UpdateBankRequest(UUID uuid,
                                String name,
                                String cnpj,
                                String code) {
}
