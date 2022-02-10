package com.example.web.data.mapper

import com.example.web.data.database.LinkContainerDbModel
import com.example.web.data.network.model.LinkContainerDto
import com.example.web.domain.LinkContainer

class WebViewMapper {

    fun mapDtoToDbModel(dto: LinkContainerDto) = LinkContainerDbModel(
        key = dto.key,
        link = dto.link,
        home = dto.home
    )

    fun mapDbModelToEntity(dbModel: LinkContainerDbModel) = LinkContainer(
        link = dbModel.link,
        home = dbModel.home
    )

}